package todos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
  int userid;
  int id;
  String title;
  boolean completed;

}
