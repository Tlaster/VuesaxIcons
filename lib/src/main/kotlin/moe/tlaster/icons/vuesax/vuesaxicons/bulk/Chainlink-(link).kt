package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.`Chainlink-(link)`: ImageVector
    get() {
        if (`_chainlink-(link)` != null) {
            return `_chainlink-(link)`!!
        }
        `_chainlink-(link)` = Builder(name = "Chainlink-(link)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.1799f)
                verticalLineTo(15.8299f)
                curveTo(3.0f, 16.4799f, 3.46f, 17.2599f, 4.03f, 17.5799f)
                lineTo(11.03f, 21.4699f)
                curveTo(11.56f, 21.7699f, 12.44f, 21.7699f, 12.97f, 21.4699f)
                lineTo(19.97f, 17.5799f)
                curveTo(20.54f, 17.2699f, 21.0f, 16.4799f, 21.0f, 15.8299f)
                verticalLineTo(8.1799f)
                curveTo(21.0f, 7.5299f, 20.54f, 6.7499f, 19.97f, 6.4299f)
                lineTo(12.97f, 2.5399f)
                curveTo(12.44f, 2.2399f, 11.56f, 2.2399f, 11.03f, 2.5399f)
                lineTo(4.03f, 6.4299f)
                curveTo(3.46f, 6.7399f, 3.0f, 7.5299f, 3.0f, 8.1799f)
                close()
            }
        }
        .build()
        return `_chainlink-(link)`!!
    }

private var `_chainlink-(link)`: ImageVector? = null
