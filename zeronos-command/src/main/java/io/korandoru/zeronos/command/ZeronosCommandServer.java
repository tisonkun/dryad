/*
 * Copyright 2022-2023 Korandoru Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.korandoru.zeronos.command;

import java.io.File;
import picocli.CommandLine;

@CommandLine.Command(
        name = "server",
        version = CommandConstants.VERSION,
        mixinStandardHelpOptions = true,
        description = "Commands to instantiate or manipulate a server.",
        subcommands = {
                ZeronosCommandServerStart.class
        }
)
public class ZeronosCommandServer {
}
