package com.xpn.xwiki.web;

import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;

public class LoginErrorAction extends XWikiAction {
	public String render(XWikiContext context) throws XWikiException {
        return "login";
	}
}
