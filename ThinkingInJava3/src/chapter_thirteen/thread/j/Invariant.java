package chapter_thirteen.thread.j;
/**
 * 任何需要对约束条件进行测试的类必须实现这个接口
 * @author Administrator
 *
 */
public interface Invariant {

	InvariantState invariant();
}
