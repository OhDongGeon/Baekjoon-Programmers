-- 코드를 입력하세요
    SELECT BK.BOOK_ID
         , AR.AUTHOR_NAME
         , DATE_FORMAT(BK.PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
      FROM BOOK             BK
INNER JOIN AUTHOR           AR
        ON AR.AUTHOR_ID     = BK.AUTHOR_ID
       AND BK.CATEGORY      = '경제'
  ORDER BY PUBLISHED_DATE