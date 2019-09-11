package charactor;
public class Hero {
	public String name;
	protected float hp;
	public void attackHero(Hero h) throws EnemyHeroIsDeadException {
		if (h.hp == 0) {
			throw new EnemyHeroIsDeadException(h + "已经挂了，不需要释放技能");
		}
	}
	public String toString() {
		return name;
	}
	class EnemyHeroIsDeadException extends Exception {
		public EnemyHeroIsDeadException() {
		}
		public EnemyHeroIsDeadException(String msg) {
			super(msg);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616;
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 0;
		try {
			garen.attackHero(teemo);
		} catch (EnemyHeroIsDeadException e) {
			// TODO: handle exception
			System.out.println("异常的具体原因:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
