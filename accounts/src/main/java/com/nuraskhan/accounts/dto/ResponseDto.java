package com.nuraskhan.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name="Response",
        description = "Response holds successful res info"
)
public class ResponseDto {
    @Schema(
            example="200",
            description = "Status code info"
    )
    private String statusCode;
    @Schema(
            example="Request processed successfully",
            description = "Status code message"
    )
    private String statusMsg;
}
