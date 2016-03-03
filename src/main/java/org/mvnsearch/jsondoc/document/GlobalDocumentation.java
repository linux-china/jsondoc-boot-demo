package org.mvnsearch.jsondoc.document;

import org.jsondoc.core.annotation.global.ApiGlobal;
import org.jsondoc.core.annotation.global.ApiGlobalSection;

/**
 * global document
 *
 * @author linux_china
 */

/**
 * global document
 *
 * @author linux_china
 */
@ApiGlobal(
        sections = {
                @ApiGlobalSection(
                        title = "Domain Diagram",
                        paragraphs = {"/jsondocfile:/jsondoc/domain-diagram.html"}
                ),
                @ApiGlobalSection(
                        title = "Ubiquitous Language",
                        paragraphs = {"/jsondocfile:/jsondoc/ubiquitous-language.html"}
                ),
                @ApiGlobalSection(
                        title = "Status codes",
                        paragraphs = {"/jsondocfile:/jsondoc/http-response-codes.html"}
                ),
                @ApiGlobalSection(
                        title = "Authentication",
                        paragraphs = {"/jsondocfile:/jsondoc/authentication.html"}
                ),
                @ApiGlobalSection(
                        title = "HTTP Verbs",
                        paragraphs = {
                                "HTTP Verbs",
                                "/jsondocfile:/jsondoc/http-verbs.html"
                        }
                )
        }
)
public class GlobalDocumentation {
}
