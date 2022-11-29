CREATE TABLE IF NOT EXISTS champion_abilities (
  id int NOT NULL,
  champion int NOT NULL,
  champion_name varchar(180) NOT NULL,
  champion_description text NOT NULL,
  effect text NOT NULL,
  cost varchar(180) NOT NULL,
  rango int NOT NULL
);

CREATE TABLE IF NOT EXISTS champion_stats (
  champion int NOT NULL,
  stat_name varchar(140) NOT NULL,
  stat_value decimal NOT NULL,
  modifier_per_level decimal NOT NULL
)  ;

CREATE TABLE IF NOT EXISTS champion_tips (
  id int PRIMARY KEY,
  champion int NOT NULL,
  tip text NOT NULL
)  ;
CREATE TABLE IF NOT EXISTS champions (
  id int PRIMARY KEY,
  champion_name varchar(140) NOT NULL,
  title varchar(180) NOT NULL,
  lore text NOT NULL,
  tags text NOT NULL
)  ;

CREATE TABLE IF NOT EXISTS items (
  id int PRIMARY KEY,
  item_name varchar(140) NOT NULL,
  effect varchar(140) NOT NULL
)  ;

CREATE TABLE IF NOT EXISTS runes (
  id int PRIMARY KEY,
  tier int NOT NULL,
  rune_name varchar(140) NOT NULL,
  rune_description text NOT NULL
)  ;
