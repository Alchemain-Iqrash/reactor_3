package com.alchemain.rx.http;

import io.netty.handler.codec.http.HttpContentDecompressor;
import io.netty.handler.codec.http.HttpContentDecoder;

/**
 * Decompressor hook point that currently preserves Netty's default decoder behavior.
 */
public class ObservedHttpContentDecompressor extends HttpContentDecompressor {

	@Override
	protected HttpContentDecoder newContentDecoder(final String contentEncoding) throws Exception {
		return super.newContentDecoder(contentEncoding);
	}
}
