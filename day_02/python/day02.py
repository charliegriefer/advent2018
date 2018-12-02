import string 


def main():
    file_data = open(r"../input.txt","r")
    ids = file_data.read().split("\n")
    print(part_one(ids))
    print(part_two(ids))


def part_one(ids):
    repeat_2 = set()
    repeat_3 = set()
    for id in ids:
        for letter in string.ascii_lowercase:
            result = id.count(letter)
            if result is 2:
                repeat_2.add(id)
            if result is 3:
                repeat_3.add(id)
    for q in repeat_3:
        print(q)
    return len(repeat_2) * len(repeat_3) 


def part_two(ids):
    target_length = len(ids[0])-1
    current_ids = ids.copy()
    for current_id in current_ids:
        ids.remove(current_id)
        for id in ids:
            return_value = ""
            for i in range(0, len(id)):
                if current_id[i] is id[i]:
                    return_value = return_value + current_id[i]
                if (len(return_value) is target_length):
                    return return_value


if __name__ == "__main__": 
    main()