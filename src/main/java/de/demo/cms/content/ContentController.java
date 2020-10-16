package de.demo.cms.content;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "content")
public class ContentController {
    @GetMapping(value = "/tree", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "...")
    public ResponseEntity<ContentTreeItem> getTree() {
        return null;
    }

}
