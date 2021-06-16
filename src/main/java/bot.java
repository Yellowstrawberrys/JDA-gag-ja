import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class bot extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().toLowerCase().split(" ");
        String prefix = "$";
        if(args[1].equals(prefix+"명령어")){
            event.getChannel().sendMessage("답장").queue();
        }
        if(args[1].equals(prefix+"명령어2")){
            EmbedBuilder em = new EmbedBuilder();
            em.setTitle("임베드 타이틀"); //타이틀
            em.addField("필드 제목", "필드 설명", false); //필드
            em.setColor(Color.RED); //색갈
            em.setImage("url"); //이미지
            em.setThumbnail("url"); // 썸내일
            em.setAuthor("이름", "프사"); //유저 넣기
            em.setDescription("설명"); //설명
            event.getChannel().sendMessage(em.build()).queue(); //메시지 보내기
        }
    }
}
