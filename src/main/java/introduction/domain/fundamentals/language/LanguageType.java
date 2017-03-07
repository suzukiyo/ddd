package introduction.domain.fundamentals.language;

import org.springframework.util.StringUtils;

import java.util.Locale;

public enum LanguageType {
    Japanese ("日本語", "ja", Locale.JAPANESE),
    English  ("英語", "en", Locale.ENGLISH),
    Unknown  ("", "", Locale.ROOT);

    String japaneseLabel = "";
    String label = "";
    Locale locale = Locale.ROOT;

    public static LanguageType of(String code){
        if (StringUtils.isEmpty(code)) return Unknown;
        for (LanguageType item : values()){
            if (item.label.equals(code)) return item;
        }
        return Unknown;
    }

    LanguageType(String japaneseLabel, String label, Locale locale){
        this.japaneseLabel = japaneseLabel;
        this.label = label;
        this.locale = locale;
    }

    public boolean isUnknown(){
        return is(Unknown);
    }

    private boolean is(LanguageType languageType) {
        return this == languageType;
    }
}
