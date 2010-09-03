/*
 * Copyright 2007 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.ja-sig.org/products/cas/overview/license/index.html
 */
package org.jasig.cas.client.tomcat;

/**
 *
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.1.12
 */
public abstract class AbstractCasAuthenticator extends AbstractAuthenticator {

    private String encoding;

    private String proxyCallbackUrl;

    protected final String getEncoding() {
        return this.encoding;
    }

    public final void setEncoding(final String encoding) {
        this.encoding = encoding;
    }

    protected final String getProxyCallbackUrl() {
        return this.proxyCallbackUrl;
    }

    public final void setProxyCallbackUrl(final String proxyCallbackUrl) {
        this.proxyCallbackUrl = proxyCallbackUrl;
    }

    protected final String getArtifactParameterName() {
        return "ticket";
    }

    protected final String getServiceParameterName() {
        return "Service";
    }
}
