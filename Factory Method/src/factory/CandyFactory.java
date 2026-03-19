package factory;

public class CandyFactory {
	private CandyFactory() {}
		public static Candy getCandy(CandyType type) {
			switch (type){
				case MILK:
					return new MilkCandy();
				case CHOCOLATE:
					return new ChocolateCandy();
				default:
					throw new IllegalArgumentException("Loại kẹo không hợp lệ!");
						
			}
		}
	}


