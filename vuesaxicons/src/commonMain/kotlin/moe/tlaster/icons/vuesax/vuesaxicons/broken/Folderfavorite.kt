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

public val BrokenGroup.Folderfavorite: ImageVector
    get() {
        if (_folderfavorite != null) {
            return _folderfavorite!!
        }
        _folderfavorite = Builder(name = "Folderfavorite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2005f, 14.78f)
                lineTo(11.7805f, 17.04f)
                curveTo(11.9005f, 17.15f, 12.0905f, 17.15f, 12.2105f, 17.04f)
                lineTo(14.7905f, 14.78f)
                curveTo(15.4605f, 14.19f, 15.5505f, 13.19f, 14.9905f, 12.49f)
                curveTo(14.4305f, 11.79f, 13.4105f, 11.66f, 12.7005f, 12.2f)
                lineTo(12.0005f, 12.74f)
                lineTo(11.2905f, 12.21f)
                curveTo(10.5705f, 11.67f, 9.5605f, 11.8f, 9.0005f, 12.5f)
                curveTo(8.4405f, 13.19f, 8.5305f, 14.2f, 9.2005f, 14.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.02f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(10.0f, 2.0f, 10.33f, 2.44f, 10.9f, 3.2f)
                lineTo(12.4f, 5.2f)
                curveTo(12.78f, 5.7f, 13.0f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 6.0f, 22.0f, 7.0f, 22.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.99f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 17.0f)
            }
        }
        .build()
        return _folderfavorite!!
    }

private var _folderfavorite: ImageVector? = null
