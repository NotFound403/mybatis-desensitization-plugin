package cn.felord.mybatis.plugin.desensitization;

import java.util.function.Function;

/**
 * 具体脱敏策略的函数
 *
 * @author felord.cn
 * @since 11 :24
 */
public interface Desensitizer  extends Function<String,String>  {

}
