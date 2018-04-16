package com.bec.security.core.validate.code.image;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import com.bec.security.core.validate.code.impl.AbstractValidateCodeProcessor;

@Component("imageCodeProcessor")
public class ImageCodeProcessor extends AbstractValidateCodeProcessor<ImageCode> {

	@Override
	public void send(ServletWebRequest request, ImageCode validateCode) throws Exception{
			ImageIO.write(validateCode.getImage(), "JPEG", request.getResponse().getOutputStream());
	}


}
