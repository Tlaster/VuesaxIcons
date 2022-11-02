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

public val BulkGroup.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.24f, 2.0f)
                horizontalLineTo(7.76f)
                curveTo(5.0f, 2.0f, 4.0f, 3.0f, 4.0f, 5.81f)
                verticalLineTo(18.19f)
                curveTo(4.0f, 21.0f, 5.0f, 22.0f, 7.76f, 22.0f)
                horizontalLineTo(16.23f)
                curveTo(19.0f, 22.0f, 20.0f, 21.0f, 20.0f, 18.19f)
                verticalLineTo(5.81f)
                curveTo(20.0f, 3.0f, 19.0f, 2.0f, 16.24f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                curveTo(9.25f, 5.09f, 9.59f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 4.75f, 14.75f, 5.09f, 14.75f, 5.5f)
                curveTo(14.75f, 5.91f, 14.41f, 6.25f, 14.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.3f)
                curveTo(12.9665f, 19.3f, 13.75f, 18.5165f, 13.75f, 17.55f)
                curveTo(13.75f, 16.5835f, 12.9665f, 15.8f, 12.0f, 15.8f)
                curveTo(11.0335f, 15.8f, 10.25f, 16.5835f, 10.25f, 17.55f)
                curveTo(10.25f, 18.5165f, 11.0335f, 19.3f, 12.0f, 19.3f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
