"""
3. 두 자리의 복권권호를 맞춰 아래의 조건에 따라 상금을 받는 복권 프로그램을 작성하시오.
3.1 사용자의 예상번호가 정확한 순서로 복권번호와 모두 일치하면 10,000,000원의 상금을 받는다.
3.2 사용자의 예상번호가 순서는 다르지만 복권번호와 모두 일치하면 3,000,000원의 상금을 받는다.
3.3 사용자의 예상번호 중 1개 숫자만 복권번호와 순서까지 일치하면 1,000,000원의 상금을 받는다.
"""

import random

lt_num = random.sample(range(1, 10), 2) #복권번호(랜덤) 설정

sq_cnt = 0 #순서가 일치한 수
num_cnt = 0 #숫자가 일치한 수

while True:
    num = input("복권 예상번호를 입력하세요(두 자릿수): ") #복권 번호 사용자 입력
    
    if(num[0] == num[1]): #중복 방지
        print("1~9사이의 다른 숫자 2개를 각각 입력해주세요.")
        continue
    else:
        pass
    
    for i in range(0, 2):
        for j in range(0, 2):
            if(num[i] == str(lt_num[j]) and i == j):
                sq_cnt += 1
            elif(num[i] == str(lt_num[j]) and i != j):
                num_cnt += 1
            
    if sq_cnt == 2:
        print("복권번호는 " + str(lt_num) + " 입니다.")
        print("순서와 숫자 모두 일치: 10,000,000원을 획득하셨습니다.")
    elif num_cnt == 2:
        print("복권번호는 " + str(lt_num) + " 입니다.")
        print("숫자만 모두 일치: 3,000,000원을 획득하셨습니다.")
    elif sq_cnt == 1:
        print("복권번호는 " + str(lt_num) + " 입니다.")
        print("한자리 숫자 일치: 1,000,000원을 획득하셨습니다.")
    else:
        print("복권번호는 " + str(lt_num) + " 입니다.")
        print("아쉽게도 일치하는 숫자가 없습니다.")
        break