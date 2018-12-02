def main():
    file_data = open(r"../input.txt","r")
    numbers = list(map(lambda x: int(x), file_data.readlines()))
    print(part_one(numbers))
    print(part_two(numbers))


def part_one(nums):
    return sum(nums)


def part_two(nums):
    frequency = 0
    frequencies = {frequency}
    found = False
    while not found:
        for n in nums:
            frequency = frequency + n
            if frequency in frequencies:
                return frequency
            else:
                frequencies.add(frequency)


if __name__ == "__main__": 
    main()