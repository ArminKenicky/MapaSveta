

public enum ItemType {
	Zbran{
		@Override
        public String printItemType() {
            return "Zbra�";
        }
	}
	,
	Stit{
		@Override
        public String printItemType() {
            return "�t�t";
        }
	}
	,
	Odev{
		@Override
        public String printItemType() {
            return "Od�v";
        }
	}
	,
	Sperk{
		@Override
        public String printItemType() {
            return "�perk";
        }
	};

	public abstract String printItemType();
}



 
