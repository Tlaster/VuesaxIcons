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

public val BulkGroup.Blogger: ImageVector
    get() {
        if (_blogger != null) {
            return _blogger!!
        }
        _blogger = Builder(name = "Blogger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                curveTo(16.45f, 11.0f, 16.0f, 10.55f, 16.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 7.0f, 15.0f, 6.0f, 13.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(7.0f, 6.0f, 6.0f, 7.0f, 6.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 17.0f, 7.0f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(17.0f, 18.0f, 18.0f, 17.0f, 18.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(18.0f, 11.45f, 17.55f, 11.0f, 17.0f, 11.0f)
                close()
                moveTo(10.0f, 9.25f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 9.25f, 12.75f, 9.59f, 12.75f, 10.0f)
                curveTo(12.75f, 10.41f, 12.41f, 10.75f, 12.0f, 10.75f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 10.75f, 9.25f, 10.41f, 9.25f, 10.0f)
                curveTo(9.25f, 9.59f, 9.59f, 9.25f, 10.0f, 9.25f)
                close()
                moveTo(14.0f, 14.75f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 14.75f, 9.25f, 14.41f, 9.25f, 14.0f)
                curveTo(9.25f, 13.59f, 9.59f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 13.25f, 14.75f, 13.59f, 14.75f, 14.0f)
                curveTo(14.75f, 14.41f, 14.41f, 14.75f, 14.0f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
        }
        .build()
        return _blogger!!
    }

private var _blogger: ImageVector? = null
