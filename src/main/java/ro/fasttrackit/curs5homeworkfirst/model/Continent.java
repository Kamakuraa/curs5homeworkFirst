package ro.fasttrackit.curs5homeworkfirst.model;

import java.util.Optional;
import java.util.stream.Stream;

public enum Continent {

  AFRICA,
  AMERICAS,
  ASIA,
  EUROPE,
  OCEANIA;

  public static Optional<Continent> of(String continent){
    return Stream.of (values ())
      .filter (val->val.name ().equalsIgnoreCase (continent))
      .findFirst ();

  }
}
