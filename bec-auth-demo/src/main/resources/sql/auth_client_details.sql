/*
Navicat PGSQL Data Transfer

Source Server         : 49.4.14.220-5432
Source Server Version : 90511
Source Host           : 49.4.14.220:5432
Source Database       : postgres
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90511
File Encoding         : 65001

Date: 2018-04-17 15:15:07
*/


-- ----------------------------
-- Table structure for auth_client_details
-- ----------------------------
DROP TABLE IF EXISTS "public"."auth_client_details";
CREATE TABLE "public"."auth_client_details" (
"client_id" varchar(32) COLLATE "default" NOT NULL,
"resource_ids" varchar(255) COLLATE "default",
"secret_required" bool DEFAULT true,
"client_secret" varchar(255) COLLATE "default",
"scoped" bool DEFAULT false,
"scope" varchar(255) COLLATE "default" DEFAULT 'all'::character varying,
"authorized_grant_types" varchar(255) COLLATE "default" DEFAULT 'refresh_token,password'::character varying,
"registered_redirect_uri" varchar(255) COLLATE "default",
"authorities" varchar(255) COLLATE "default",
"refresh_token_validity_seconds" int4 DEFAULT 604800,
"access_token_validity_seconds" int4 DEFAULT 7200,
"auto_approve" bool DEFAULT true,
"additional_information" varchar(255) COLLATE "default",
"record_time" timestamp(6) DEFAULT now()
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."auth_client_details" IS 'oauth2登录-client_details表';
COMMENT ON COLUMN "public"."auth_client_details"."client_id" IS 'The client id.';
COMMENT ON COLUMN "public"."auth_client_details"."resource_ids" IS 'The resources that this client can access. Can be ignored by callers if empty.';
COMMENT ON COLUMN "public"."auth_client_details"."secret_required" IS 'Whether a secret is required to authenticate this client.';
COMMENT ON COLUMN "public"."auth_client_details"."client_secret" IS 'The client secret. Ignored if the {@link #isSecretRequired() secret isn''t required}.';
COMMENT ON COLUMN "public"."auth_client_details"."scoped" IS 'Whether this client is limited to a specific scope. If false, the scope of the authentication request will be ignored.';
COMMENT ON COLUMN "public"."auth_client_details"."scope" IS 'The scope of this client. Empty if the client isn''t scoped.';
COMMENT ON COLUMN "public"."auth_client_details"."authorized_grant_types" IS 'The grant types for which this client is authorized.';
COMMENT ON COLUMN "public"."auth_client_details"."registered_redirect_uri" IS 'The pre-defined redirect URI for this client to use during the "authorization_code" access grant.';
COMMENT ON COLUMN "public"."auth_client_details"."authorities" IS 'Returns the authorities that are granted to the OAuth client.';
COMMENT ON COLUMN "public"."auth_client_details"."refresh_token_validity_seconds" IS 'The refresh token validity period for this client.';
COMMENT ON COLUMN "public"."auth_client_details"."access_token_validity_seconds" IS 'The access token validity period for this client.';
COMMENT ON COLUMN "public"."auth_client_details"."auto_approve" IS 'Test whether client needs user approval for a particular scope.';
COMMENT ON COLUMN "public"."auth_client_details"."additional_information" IS 'Additional information for this client, not needed by the vanilla OAuth protocol but might be useful';

-- ----------------------------
-- Records of auth_client_details
-- ----------------------------
INSERT INTO "public"."auth_client_details" VALUES ('jsbec', null, 't', 'bec1234!', 'f', 'all', 'refresh_token,password', null, null, '604800', '7200', 't', null, '2018-04-17 14:47:48.160505');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table auth_client_details
-- ----------------------------
ALTER TABLE "public"."auth_client_details" ADD PRIMARY KEY ("client_id");
