import subprocess


def main():
    db_path = "sqlite:///../resources/coref_python_src.db"
    table_name = "yield_expression"
    dao_class_name = table_name + ".py"
    print(
        subprocess.call(
            [
                "sqlacodegen",
                db_path,
                "--tables",
                table_name,
                "--outfile",
                dao_class_name,
            ]
        ),
        flush=True,
    )
    # with open("../resources/coref_python_src.sql", "r") as source:
    #     contents = source.readlines()
    #     for line in contents:
    #         if line.startswith("CREATE"):
    #             table_name = line.split("\"")[1]
    #             dao_class_name = table_name + ".py"
    #             print(subprocess.call(["sqlacodegen", db_path, "--tables", table_name, "--outfile", dao_class_name]), flush=True)


if __name__ == "__main__":
    main()
