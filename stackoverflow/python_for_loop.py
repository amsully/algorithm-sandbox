# original
names= ["lloyd", "alice","tyler"]

for name in names:
	name= {
		"name":[name],
		"homework":[],
		"quizzes":[],
		"tests":[]
	}

print(names)

# Solved below

names= ["lloyd", "alice","tyler"]

for name in names:
	names[names.index(name)]= {
		"name":[name],
		"homework":[],
		"quizzes":[],
		"tests":[]
	}

print(names)
