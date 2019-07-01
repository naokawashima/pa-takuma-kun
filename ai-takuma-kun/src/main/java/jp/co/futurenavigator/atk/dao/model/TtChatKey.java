package jp.co.futurenavigator.atk.dao.model;

import java.io.Serializable;

public class TtChatKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_chat.CHAT_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    private Long chatId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tt_chat.TALKER_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    private Long talkerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tt_chat
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_chat.CHAT_ID
     *
     * @return the value of tt_chat.CHAT_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    public Long getChatId() {
        return chatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_chat.CHAT_ID
     *
     * @param chatId the value for tt_chat.CHAT_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tt_chat.TALKER_ID
     *
     * @return the value of tt_chat.TALKER_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    public Long getTalkerId() {
        return talkerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tt_chat.TALKER_ID
     *
     * @param talkerId the value for tt_chat.TALKER_ID
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    public void setTalkerId(Long talkerId) {
        this.talkerId = talkerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_chat
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chatId=").append(chatId);
        sb.append(", talkerId=").append(talkerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_chat
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TtChatKey other = (TtChatKey) that;
        return (this.getChatId() == null ? other.getChatId() == null : this.getChatId().equals(other.getChatId()))
            && (this.getTalkerId() == null ? other.getTalkerId() == null : this.getTalkerId().equals(other.getTalkerId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_chat
     *
     * @mbg.generated Sat Jun 29 19:22:02 JST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChatId() == null) ? 0 : getChatId().hashCode());
        result = prime * result + ((getTalkerId() == null) ? 0 : getTalkerId().hashCode());
        return result;
    }
}