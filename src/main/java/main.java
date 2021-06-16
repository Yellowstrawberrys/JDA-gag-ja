import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("토큰");

        // 필요없는거 삭제
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        builder.addEventListeners(new bot());
        // 상메 설정
        builder.setActivity(Activity.watching("뭐 보는중"));

        builder.build();
    }
}
