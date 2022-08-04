package shop.comuser.homework.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class SearchParam {
    private String account;
    private String email;
    private int page;
}
