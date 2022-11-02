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

public val TwotoneGroup.Simcard2: ImageVector
    get() {
        if (_simcard2 != null) {
            return _simcard2!!
        }
        _simcard2 = Builder(name = "Simcard2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.6899f)
                verticalLineTo(18.0799f)
                curveTo(16.0f, 20.4199f, 14.44f, 21.9699f, 12.11f, 21.9699f)
                horizontalLineTo(5.89f)
                curveTo(3.56f, 21.9699f, 2.0f, 20.4199f, 2.0f, 18.0799f)
                verticalLineTo(10.3099f)
                curveTo(2.0f, 7.9699f, 3.56f, 6.4199f, 5.89f, 6.4199f)
                horizontalLineTo(9.72f)
                curveTo(10.75f, 6.4199f, 11.74f, 6.8299f, 12.47f, 7.5599f)
                lineTo(14.86f, 9.9399f)
                curveTo(15.59f, 10.6699f, 16.0f, 11.6599f, 16.0f, 12.6899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.2502f)
                verticalLineTo(13.6402f)
                curveTo(22.0f, 15.9702f, 20.44f, 17.5302f, 18.11f, 17.5302f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.6902f)
                curveTo(16.0f, 11.6602f, 15.59f, 10.6702f, 14.86f, 9.9402f)
                lineTo(12.47f, 7.5602f)
                curveTo(11.74f, 6.8302f, 10.75f, 6.4202f, 9.72f, 6.4202f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.8602f)
                curveTo(8.0f, 3.5302f, 9.56f, 1.9702f, 11.89f, 1.9702f)
                horizontalLineTo(15.72f)
                curveTo(16.75f, 1.9702f, 17.74f, 2.3802f, 18.47f, 3.1102f)
                lineTo(20.86f, 5.5002f)
                curveTo(21.59f, 6.2302f, 22.0f, 7.2202f, 22.0f, 8.2502f)
                close()
            }
        }
        .build()
        return _simcard2!!
    }

private var _simcard2: ImageVector? = null
