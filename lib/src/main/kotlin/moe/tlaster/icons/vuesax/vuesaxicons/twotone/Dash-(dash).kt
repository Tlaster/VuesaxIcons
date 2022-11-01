package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Dash-(dash)`: ImageVector
    get() {
        if (`_dash-(dash)` != null) {
            return `_dash-(dash)`!!
        }
        `_dash-(dash)` = Builder(name = "Dash-(dash)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1204f, 3.5f)
                horizontalLineTo(16.0004f)
                curveTo(20.0004f, 3.5f, 22.0004f, 6.0f, 22.0004f, 9.5f)
                verticalLineTo(12.0f)
                curveTo(22.0004f, 17.0f, 19.0004f, 20.5f, 13.5004f, 20.5f)
                horizontalLineTo(3.9404f)
                lineTo(5.0004f, 16.25f)
                horizontalLineTo(12.4404f)
                curveTo(16.0004f, 16.25f, 17.7504f, 14.0f, 17.7504f, 10.94f)
                verticalLineTo(10.75f)
                curveTo(17.7504f, 9.0f, 17.0004f, 7.75f, 14.7504f, 7.75f)
                horizontalLineTo(6.0604f)
                lineTo(7.1204f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 10.5f)
                horizontalLineTo(4.31f)
                curveTo(3.39f, 10.5f, 2.59f, 11.12f, 2.37f, 12.01f)
                lineTo(2.0f, 13.5f)
                horizontalLineTo(9.19f)
                curveTo(10.11f, 13.5f, 10.91f, 12.88f, 11.13f, 11.99f)
                lineTo(11.5f, 10.5f)
                close()
            }
        }
        .build()
        return `_dash-(dash)`!!
    }

private var `_dash-(dash)`: ImageVector? = null
