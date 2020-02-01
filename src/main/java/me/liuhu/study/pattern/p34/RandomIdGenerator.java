package me.liuhu.study.pattern.p34;

import com.google.common.annotations.VisibleForTesting;
import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/1/31
 **/
@Slf4j
public class RandomIdGenerator implements LogTraceIdGenerator {

    @Override
    public String generate() throws IdGenerationFailureException {
        String id = "";
        String substrOfHostName = null;
        try {
            substrOfHostName = getLastFieldOfHostName();
        } catch (UnknownHostException e) {
            throw new IdGenerationFailureException("Unknown host name");
        } catch (IllegalArgumentException e) {
            throw new IdGenerationFailureException(e.getMessage());
        }
        long currentTimeMillis = getCurrentTimeMillis();
        String randomString = randomStr(8);
        id = String.format("%s-%d-%s", substrOfHostName, currentTimeMillis, randomString);
        return id;
    }

    /**
     * 获取当时时间戳
     * @return
     */
    private long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * 获取hostName
     * @return
     */
    private String getLastFieldOfHostName() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        return getLastSubstrSplitByDot(hostName);
    }

    @VisibleForTesting
    protected String getLastSubstrSplitByDot(String hostName) {
        if (null == hostName || hostName.isEmpty()) {
            throw new IllegalArgumentException("host name is blank");
        }
        String[] tokens = hostName.split("\\.");
        return tokens[tokens.length - 1];
    }

    /**
     * 生成随机字符串 0～9,A~Z,a~z
     * @param length 需要的长度
     * @return
     */
    @VisibleForTesting
    protected String randomStr(int length) {
        if (length <= 0) {
            return null;
        }
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit= randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase= randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase= randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit|| isUppercase || isLowercase) {
                randomChars[count] = (char) (randomAscii);
                ++count;
            }
        }
        return new String(randomChars);
    }

}
