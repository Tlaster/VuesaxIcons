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

public val BulkGroup.Cloudfog: ImageVector
    get() {
        if (_cloudfog != null) {
            return _cloudfog!!
        }
        _cloudfog = Builder(name = "Cloudfog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.799f, 12.0f)
                horizontalLineTo(4.1991f)
                curveTo(3.9791f, 12.0f, 3.7791f, 11.85f, 3.7091f, 11.64f)
                curveTo(0.9591f, 2.55f, 14.8391f, -0.94f, 16.4391f, 8.82f)
                curveTo(18.0991f, 9.03f, 19.409f, 9.97f, 20.219f, 11.23f)
                curveTo(20.439f, 11.56f, 20.189f, 12.0f, 19.799f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.78f)
                horizontalLineTo(4.0f)
                curveTo(3.59f, 15.78f, 3.25f, 15.44f, 3.25f, 15.03f)
                curveTo(3.25f, 14.62f, 3.59f, 14.28f, 4.0f, 14.28f)
                horizontalLineTo(20.0f)
                curveTo(20.41f, 14.28f, 20.75f, 14.62f, 20.75f, 15.03f)
                curveTo(20.75f, 15.44f, 20.41f, 15.78f, 20.0f, 15.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.78f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 18.78f, 5.25f, 18.44f, 5.25f, 18.03f)
                curveTo(5.25f, 17.62f, 5.59f, 17.28f, 6.0f, 17.28f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 17.28f, 18.75f, 17.62f, 18.75f, 18.03f)
                curveTo(18.75f, 18.44f, 18.41f, 18.78f, 18.0f, 18.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 21.78f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 21.78f, 8.25f, 21.44f, 8.25f, 21.03f)
                curveTo(8.25f, 20.62f, 8.59f, 20.28f, 9.0f, 20.28f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 20.28f, 15.75f, 20.62f, 15.75f, 21.03f)
                curveTo(15.75f, 21.44f, 15.41f, 21.78f, 15.0f, 21.78f)
                close()
            }
        }
        .build()
        return _cloudfog!!
    }

private var _cloudfog: ImageVector? = null
