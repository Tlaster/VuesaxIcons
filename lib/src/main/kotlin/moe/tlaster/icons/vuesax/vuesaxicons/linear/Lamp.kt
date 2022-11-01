package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.78f, 13.6499f)
                verticalLineTo(18.5899f)
                horizontalLineTo(3.22f)
                verticalLineTo(13.6499f)
                curveTo(3.22f, 8.8299f, 7.12f, 4.9299f, 11.94f, 4.9299f)
                horizontalLineTo(12.06f)
                curveTo(16.88f, 4.9299f, 20.78f, 8.8299f, 20.78f, 13.6499f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.93f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.65f, 18.59f)
                curveTo(15.52f, 20.5f, 13.93f, 22.0f, 12.0f, 22.0f)
                curveTo(10.07f, 22.0f, 8.48f, 20.5f, 8.35f, 18.59f)
                horizontalLineTo(15.65f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
