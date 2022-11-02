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

public val OutlineGroup.Arrowsquareup: ImageVector
    get() {
        if (_arrowsquareup != null) {
            return _arrowsquareup!!
        }
        _arrowsquareup = Builder(name = "Arrowsquareup", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.5302f, 14.2101f)
                curveTo(15.3402f, 14.2101f, 15.1502f, 14.1401f, 15.0002f, 13.9901f)
                lineTo(12.0002f, 10.9901f)
                lineTo(9.0002f, 13.9901f)
                curveTo(8.7102f, 14.2801f, 8.2302f, 14.2801f, 7.9402f, 13.9901f)
                curveTo(7.6502f, 13.7001f, 7.6502f, 13.2201f, 7.9402f, 12.9301f)
                lineTo(11.4702f, 9.4001f)
                curveTo(11.7602f, 9.1101f, 12.2402f, 9.1101f, 12.5302f, 9.4001f)
                lineTo(16.0602f, 12.9301f)
                curveTo(16.3502f, 13.2201f, 16.3502f, 13.7001f, 16.0602f, 13.9901f)
                curveTo(15.9102f, 14.1401f, 15.7202f, 14.2101f, 15.5302f, 14.2101f)
                close()
            }
        }
        .build()
        return _arrowsquareup!!
    }

private var _arrowsquareup: ImageVector? = null
