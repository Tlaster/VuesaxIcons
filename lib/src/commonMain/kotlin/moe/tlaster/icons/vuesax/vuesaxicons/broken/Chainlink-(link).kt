package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Chainlink-(link)`: ImageVector
    get() {
        if (`_chainlink-(link)` != null) {
            return `_chainlink-(link)`!!
        }
        `_chainlink-(link)` = Builder(name = "Chainlink-(link)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.6599f)
                verticalLineTo(15.8199f)
                curveTo(3.0f, 16.4699f, 3.46f, 17.2499f, 4.03f, 17.5699f)
                lineTo(11.03f, 21.4599f)
                curveTo(11.56f, 21.7599f, 12.44f, 21.7599f, 12.97f, 21.4599f)
                lineTo(19.97f, 17.5699f)
                curveTo(20.54f, 17.2599f, 21.0f, 16.4699f, 21.0f, 15.8199f)
                verticalLineTo(8.1799f)
                curveTo(21.0f, 7.5299f, 20.54f, 6.7499f, 19.97f, 6.4299f)
                lineTo(12.97f, 2.5399f)
                curveTo(12.44f, 2.2399f, 11.56f, 2.2399f, 11.03f, 2.5399f)
                lineTo(4.03f, 6.4299f)
                curveTo(3.46f, 6.7399f, 3.0f, 7.5299f, 3.0f, 8.1799f)
            }
        }
        .build()
        return `_chainlink-(link)`!!
    }

private var `_chainlink-(link)`: ImageVector? = null
