package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Pictureframe: ImageVector
    get() {
        if (_pictureframe != null) {
            return _pictureframe!!
        }
        _pictureframe = Builder(name = "Pictureframe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9501f, 22.7502f)
                curveTo(13.6101f, 22.7502f, 13.31f, 22.5202f, 13.22f, 22.1802f)
                lineTo(8.2701f, 2.1802f)
                curveTo(8.1701f, 1.7802f, 8.4201f, 1.3702f, 8.8201f, 1.2702f)
                curveTo(9.2201f, 1.1702f, 9.6301f, 1.4102f, 9.7301f, 1.8202f)
                lineTo(14.6801f, 21.8202f)
                curveTo(14.7801f, 22.2202f, 14.5301f, 22.6302f, 14.1301f, 22.7302f)
                curveTo(14.0701f, 22.7402f, 14.0101f, 22.7502f, 13.9501f, 22.7502f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9999f, 15.7501f)
                curveTo(1.6698f, 15.7501f, 1.3799f, 15.5401f, 1.2799f, 15.2101f)
                curveTo(1.1599f, 14.8101f, 1.3898f, 14.4001f, 1.7898f, 14.2801f)
                lineTo(11.3199f, 11.5001f)
                curveTo(11.7199f, 11.3801f, 12.1299f, 11.6101f, 12.2499f, 12.0101f)
                curveTo(12.3699f, 12.4101f, 12.1398f, 12.8201f, 11.7398f, 12.9401f)
                lineTo(2.2099f, 15.7201f)
                curveTo(2.1399f, 15.7401f, 2.0698f, 15.7501f, 1.9999f, 15.7501f)
                close()
            }
        }
        .build()
        return _pictureframe!!
    }

private var _pictureframe: ImageVector? = null
