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

public val BulkGroup.Folderminus: ImageVector
    get() {
        if (_folderminus != null) {
            return _folderminus!!
        }
        _folderminus = Builder(name = "Folderminus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.74f, 9.44f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.42f)
                curveTo(2.0f, 3.98f, 3.98f, 2.0f, 6.42f, 2.0f)
                horizontalLineTo(8.75f)
                curveTo(10.38f, 2.0f, 10.89f, 2.53f, 11.54f, 3.4f)
                lineTo(12.94f, 5.26f)
                curveTo(13.25f, 5.67f, 13.29f, 5.73f, 13.87f, 5.73f)
                horizontalLineTo(16.66f)
                curveTo(19.03f, 5.72f, 21.05f, 7.28f, 21.74f, 9.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 10.8399f)
                curveTo(21.97f, 10.3499f, 21.89f, 9.8899f, 21.74f, 9.4399f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.6499f)
                curveTo(2.0f, 19.5999f, 4.4f, 21.9999f, 7.35f, 21.9999f)
                horizontalLineTo(16.65f)
                curveTo(19.6f, 21.9999f, 22.0f, 19.5999f, 22.0f, 16.6499f)
                verticalLineTo(11.0699f)
                curveTo(22.0f, 10.9999f, 22.0f, 10.9099f, 21.99f, 10.8399f)
                close()
                moveTo(14.43f, 16.2999f)
                horizontalLineTo(9.43f)
                curveTo(9.02f, 16.2999f, 8.68f, 15.9599f, 8.68f, 15.5499f)
                curveTo(8.68f, 15.1399f, 9.02f, 14.7999f, 9.43f, 14.7999f)
                horizontalLineTo(14.43f)
                curveTo(14.84f, 14.7999f, 15.18f, 15.1399f, 15.18f, 15.5499f)
                curveTo(15.18f, 15.9599f, 14.84f, 16.2999f, 14.43f, 16.2999f)
                close()
            }
        }
        .build()
        return _folderminus!!
    }

private var _folderminus: ImageVector? = null
