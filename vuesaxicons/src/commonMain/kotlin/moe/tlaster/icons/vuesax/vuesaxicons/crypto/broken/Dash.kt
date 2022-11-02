package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Dash: ImageVector
    get() {
        if (_dash != null) {
            return _dash!!
        }
        _dash = Builder(name = "Dash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0094f, 20.5f)
                horizontalLineTo(3.9395f)
                lineTo(4.9995f, 16.25f)
                horizontalLineTo(12.4395f)
                curveTo(15.9995f, 16.25f, 17.7495f, 14.0f, 17.7495f, 10.94f)
                verticalLineTo(10.75f)
                curveTo(17.7495f, 9.0f, 16.9995f, 7.75f, 14.7495f, 7.75f)
                horizontalLineTo(6.0595f)
                lineTo(7.1195f, 3.5f)
                horizontalLineTo(15.9995f)
                curveTo(19.9995f, 3.5f, 21.9995f, 6.0f, 21.9995f, 9.5f)
                verticalLineTo(12.0f)
                curveTo(21.9995f, 17.0f, 18.9995f, 20.5f, 13.4995f, 20.5f)
                horizontalLineTo(10.9395f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        return _dash!!
    }

private var _dash: ImageVector? = null
