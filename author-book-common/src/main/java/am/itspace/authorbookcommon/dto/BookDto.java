package am.itspace.authorbookcommon.dto;

import am.itspace.authorbookcommon.entity.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private int id;
    private String title;
    private String description;
    private Language language;
    private AuthorDto authorDto;
}
