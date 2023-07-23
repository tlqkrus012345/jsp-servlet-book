package org.example.servlet.view;

import static org.example.servlet.view.RedirectView.DEFAULT_REDIRECT_PREFIX;

public class JspViewResolver implements ViewResolver{

    @Override
    public View resolveView(String viewName) {
        if (viewName.startsWith(DEFAULT_REDIRECT_PREFIX)) {
            return new RedirectView(viewName);
        }
        return new JspView(viewName + ".jsp");
    }
}
