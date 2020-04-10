"""
2. 서비스료와 팁 비율을 사용자 입력으로 받아드리고, 팁 금액과 총액을 계산하는 프로그래밍을 작성하시오. 
(팁은 소수점 둘째자리까지만 사용한다.)
"""

sc = input("서비스료를 입력하시오: ") #sc: Sevice Charce
tr = input("팁 비율을 입력하시오: ") #tr: Tip Ratio

#팁과 총 요금 계산
tip = float(sc) * (float(tr)/100)
td = float(sc) + tip #td: Total Due

print("팁은 " + '%.2f'%tip + " 이고 총 요금은 " + '%.2f'%td + " 입니다.")