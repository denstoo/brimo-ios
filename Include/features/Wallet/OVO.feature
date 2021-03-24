Feature: OVO
	@101-104
		Scenario Outline: Go To Wallet From Dashboard
		And I want to top up my wallet in account <username>
		Examples: 
      | username   |
      | brimosv004 |
 	@105-109
		Scenario: Service Wallet Form
		When I saw my top up wallet history
 	@110-115
		Scenario Outline: User tidak ada data nomor pembelian Top Up Terakhir
		When I can search my wallet list
	@116
		Scenario: Go To Wallet New Form
		Given Costum
		When I want to add recipient of wallet
	@201-212
	Scenario Outline: Service Wallet New Form
		When I try adding recipient of wallet in condition with <wallet>, <type> and <walletNumber>
		 Examples: 
      | wallet  | type 	| walletNumber	|
      | OVO			| null	| 081218022786	|
	@301-309
	Scenario Outline: Go To Nominal Form
#		Given Costum
		When I inputting <amount> for the wallet amount and <decision> with <name> , then choose account <debit>
		 Examples: 
      |	decision	| name		| debit	   			| amount |
      |	Save			| John		| Brigitta-Giro	| 30000  |
      #|	NULL			| NULL		| RATRI	|
      # Debit = Buanyak | Britama X | Rekening sudah ditutup | Rekening Anda tidak aktif | Rekening Anda tidak aktif | Brigitta-Giro | GIRO SALDO TIDAK CUKUP |
      

#TC_BRImo_app_LinkAja_iOS_dompet_digital_317	Field terisi semua dan menekan button Top Up tanpa ada Koneksi Internet
#TC_BRImo_app_LinkAja_iOS_dompet_digital_314	User hanya dapat input angka di Field Norminal
#TC_BRImo_app_LinkAja_iOS_dompet_digital_319	Pembayaran Top Up LinkAja dengan Rekening Sumber  Giro dengan Saldo Cukup
#TC_BRImo_app_LinkAja_iOS_dompet_digital_320	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Saldo Tidak Cukup
#TC_BRImo_app_LinkAja_iOS_dompet_digital_321	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Saldo Tidak Cukup
#TC_BRImo_app_LinkAja_iOS_dompet_digital_322	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Status Closed/Dormant/Freeze
#TC_BRImo_app_LinkAja_iOS_dompet_digital_323	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Status Closed/Dormant/Freeze
#TC_BRImo_app_LinkAja_iOS_dompet_digital_324	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Status Closed/Dormant/Freeze
	
      
      
#TC_BRImo_app_LinkAja_iOS_dompet_digital_310	Top up diatas limit harian (user biasa)
#TC_BRImo_app_LinkAja_iOS_dompet_digital_311	Top up pertama 50 jt kemudian melakukan top up kedua 60 jt menggunakan akun user biasa
#TC_BRImo_app_LinkAja_iOS_dompet_digital_312	Top up diatas limit harian (user premium)
#TC_BRImo_app_LinkAja_iOS_dompet_digital_313	Top up pertama 150 jt kemudian melakukan top up kedua 160 jt menggunakan akun user premium
#TC_BRImo_app_LinkAja_iOS_dompet_digital_318	Pembayaran Top Up LinkAja dengan memasukan nomor tlp secara manual dan dengan Rekening Sumber Tabungan dengan Saldo Cukup
#TC_BRImo_app_LinkAja_iOS_dompet_digital_325	Pembayaran Top Up LinkAja dengan Rekening Sumber Tabungan dengan Skenario Reversal
#TC_BRImo_app_LinkAja_iOS_dompet_digital_326	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Skenario Reversal
#TC_BRImo_app_LinkAja_iOS_dompet_digital_327	Pembayaran Top Up LinkAja dengan Rekening Sumber Giro dengan Skenario Kurang/Melebihi Limit Top Up


  @401-403
  Scenario Outline:
  When I confirm top up wallet with <detail> and <wallet>
		Examples:
      | wallet		| detail		|
      | OVO			  | wallet		|
  @604
  Scenario Outline:
  When I validate my pin with <pin> before transaction
  	Examples:
  	| pin |
  	| 191919 |
  @701
  Scenario:
  Then Transaction success
  #And I close application
		
#	@201
#	Scenario Outline:
#	When I chose the <wallet> wallet <type>
 #	Examples: 
  #| wallet    | type     |
  #| LinkAja   |          |
  #| Gopay     | Customer |
  #| Gopay     | Driver   |
  #| OVO       |          |
  #| ShopeePay |          |
  #| DANA      |          |
  
	@Valid01
  Scenario Outline: User top up wallet with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to top up my wallet with <condition> for <username>
    When I saw my top up wallet history
    When I want to add recipient of wallet
    When I try adding recipient of wallet in condition with <wallet>, <type> and <walletNumber>
    When I inputting <amount> for the wallet amount and <decision> with <name> , then choose account <debit>
    When I confirm top up wallet with <detail> and <wallet>
    #When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | wallet			| type 			| walletNumber	| amount	| detail			|	decision	| name		| debit	| condition	|
      | brimosv004 | Jakarta123 | 123457 | Gopay			| Customer	| 081212341234	| 10000		| wallet			|	NULL			| NULL		| RATRI	|	NEW				|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Driver		| 081212341234	| 10000		| wallet			| NULL			| NULL		| RATRI	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Merchant	| 081212341234	| 10000		| wallet			| NULL			| NULL		| RATRI	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | LinkAja		| null			| 085691335269	| 10000		| wallet			| NULL			| NULL		| RATRI	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | OVO				| null			| 080012345123	| 20000		| wallet			| NULL			| NULL		| RATRI	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | ShopeePay	| null			| 081290825284	| 10000		| wallet			| NULL			| NULL		| RATRI	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | DANA			| null			| 082299888040	| 10000		| wallet			| NULL			| NULL		| RATRI	|	NULL			| 
      
  #@Invalid  
  #Scenario Outline: User top up wallet - Abnormal Saldo
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to top up my wallet with <condition> for <username>
    #When I saw my top up wallet history
    #When I want to add recipient of wallet
    #When I try adding recipient of wallet in condition with <wallet>, <type> and <walletNumber>
    #Then Abnormal Saldo - I inputting <amount> for the wallet amount with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | wallet			| type 			| walletNumber	| amount	| condition	|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Customer	| 081212341234	| 10000		|	NEW				|
   
   #@Valid 
   #Scenario Outline: User top up wallet with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to top up my wallet with <condition> for <username>
    #When I saw my top up wallet history
    #When I want to add recipient of wallet
    #When I try adding recipient of wallet in condition with <wallet>, <type> and <walletNumber>
    #When I inputting <amount> for the wallet amount and <decision> with <name> , then choose account <debit>
    #When I confirm top up wallet with <detail> and <wallet>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | wallet			| type 			| walletNumber	| amount	| detail			|	decision	| name		| debit					| condition	|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Customer	| 081212341234	| 10000		| wallet			|	Save			| Gopay 1	| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Driver		| 081212341234	| 10000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| Merchant	| 081212341234	| 10000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | LinkAja		| null			| 085691335269	| 10000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | OVO				| null			| 080012345123	| 20000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | ShopeePay	| null			| 081290825284	| 10000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #| brimosv004 | Jakarta123 | 123457 | DANA			| null			| 082299888040	| 10000		| wallet			| NULL			| NULL		| Rihana Elaela	|	NULL			|
      #
      #
  #@Valid
#	Scenario Outline: User top up wallet from list
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to top up my wallet with <condition> for <username>
    #When I saw my top up wallet history
    #When I top up wallet from my list
    #When I inputting <amount> for the wallet amount and <decision> with <name> , then choose account <debit>
    #When I confirm top up wallet with <detail> and <wallet>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | wallet			| amount	| detail			|	decision	| name		| debit	| condition	|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| 10000		| wallet			|	NULL			| NULL		| RATRI	|	NULL			|
      #
   #@Valid   
   #Scenario Outline: User top up wallet from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to top up my wallet with <condition> for <username>
    #When I saw my top up wallet history
    #When I top up wallet from my history
    #When I inputting <amount> for the wallet amount and <decision> with <name> , then choose account <debit>
    #When I confirm top up wallet with <detail> and <wallet>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | wallet			| amount	| detail			|	decision	| name		| debit	| condition	|
      #| brimosv004 | Jakarta123 | 123457 | Gopay			| 10000		| wallet			|	NULL			| NULL		| RATRI	|	NULL			|

	