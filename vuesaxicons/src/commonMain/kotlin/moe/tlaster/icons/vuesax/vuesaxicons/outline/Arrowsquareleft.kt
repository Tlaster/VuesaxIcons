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

public val OutlineGroup.Arrowsquareleft: ImageVector
    get() {
        if (_arrowsquareleft != null) {
            return _arrowsquareleft!!
        }
        _arrowsquareleft = Builder(name = "Arrowsquareleft", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.2599f, 16.2802f)
                curveTo(13.0699f, 16.2802f, 12.8799f, 16.2102f, 12.7299f, 16.0602f)
                lineTo(9.1999f, 12.5302f)
                curveTo(8.9099f, 12.2402f, 8.9099f, 11.7602f, 9.1999f, 11.4702f)
                lineTo(12.7299f, 7.9402f)
                curveTo(13.0199f, 7.6502f, 13.4999f, 7.6502f, 13.7899f, 7.9402f)
                curveTo(14.0799f, 8.2302f, 14.0799f, 8.7102f, 13.7899f, 9.0002f)
                lineTo(10.7899f, 12.0002f)
                lineTo(13.7899f, 15.0002f)
                curveTo(14.0799f, 15.2902f, 14.0799f, 15.7702f, 13.7899f, 16.0602f)
                curveTo(13.6499f, 16.2102f, 13.4599f, 16.2802f, 13.2599f, 16.2802f)
                close()
            }
        }
        .build()
        return _arrowsquareleft!!
    }

private var _arrowsquareleft: ImageVector? = null
