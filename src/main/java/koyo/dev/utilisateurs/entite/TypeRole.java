package koyo.dev.utilisateurs.entite;

public enum TypeRole {
  ADMIN("admin"),
  USER("user"),
  GUEST("guest");

  private final String value;

  TypeRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static TypeRole fromString(String text) {
    for (TypeRole b : TypeRole.values()) {
      if (b.value.equalsIgnoreCase(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("No constant with text " + text + " found");
  }

  @Override
  public String toString() {
    return this.value;
  }
}
