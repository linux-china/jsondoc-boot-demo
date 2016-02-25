package org.mvnsearch.jsondoc.document;

import org.jsondoc.core.annotation.global.ApiGlobal;
import org.jsondoc.core.annotation.global.ApiGlobalSection;

/**
 * global document
 *
 * @author linux_china
 */
@ApiGlobal(
        sections = {
                @ApiGlobalSection(
                        title = "HTTP Verbs",
                        paragraphs = {
                                "This is to demonstrate the use of paragraphs",
                                "/jsondocfile:/jsondoc/global-verbs.html"
                        }
                ),
                @ApiGlobalSection(
                        title = "Authentication",
                        paragraphs = {"/jsondocfile:/jsondoc/global-authentication.html"}
                ),
                @ApiGlobalSection(
                        title = "Headers",
                        paragraphs = {"/jsondocfile:/jsondoc/global-headers.html"}
                ),
                @ApiGlobalSection(
                        title = "Status codes",
                        paragraphs = {"/jsondocfile:/jsondoc/global-responsestatuscodes.html"}
                )
        }
)
public class GlobalDocumentation {
}
