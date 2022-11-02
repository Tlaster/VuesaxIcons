package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Saveminus: ImageVector
    get() {
        if (_saveminus != null) {
            return _saveminus!!
        }
        _saveminus = Builder(name = "Saveminus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.3499f)
                curveTo(2.0f, 21.7999f, 3.04f, 22.4099f, 4.31f, 21.7099f)
                lineTo(8.24f, 19.5199f)
                curveTo(8.66f, 19.2899f, 9.34f, 19.2899f, 9.76f, 19.5199f)
                lineTo(13.69f, 21.7099f)
                curveTo(14.96f, 22.4099f, 16.0f, 21.7999f, 16.0f, 20.3499f)
                verticalLineTo(8.9899f)
                curveTo(16.0f, 7.2799f, 14.6f, 5.8799f, 12.89f, 5.8799f)
                horizontalLineTo(5.11f)
                curveTo(3.4f, 5.8799f, 2.0f, 7.2799f, 2.0f, 8.9899f)
                verticalLineTo(15.5099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(22.0f, 17.92f, 20.96f, 18.53f, 19.69f, 17.83f)
                lineTo(16.0f, 15.77f)
                verticalLineTo(8.99f)
                curveTo(16.0f, 7.28f, 14.6f, 5.88f, 12.89f, 5.88f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.11f)
                curveTo(8.0f, 3.4f, 9.4f, 2.0f, 11.11f, 2.0f)
                horizontalLineTo(18.89f)
                curveTo(20.6f, 2.0f, 22.0f, 3.4f, 22.0f, 5.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineTo(11.0f)
            }
        }
        .build()
        return _saveminus!!
    }

private var _saveminus: ImageVector? = null
