package ro.fasttrackit.curs5homeworkfirst.exception;

import java.util.UUID;

public class CountryNotFoundException extends RuntimeException {
  public CountryNotFoundException(UUID id) {
    super ("Country with id: " + id + " doesn't exist");
  }
}
