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

public val BulkGroup.Electricity: ImageVector
    get() {
        if (_electricity != null) {
            return _electricity!!
        }
        _electricity = Builder(name = "Electricity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4998f, 16.0f)
                horizontalLineTo(13.4998f)
                curveTo(15.9998f, 16.0f, 17.4998f, 14.2f, 17.4998f, 12.0f)
                verticalLineTo(6.91f)
                curveTo(17.4998f, 5.86f, 16.6398f, 5.0f, 15.5898f, 5.0f)
                horizontalLineTo(8.4198f)
                curveTo(7.3698f, 5.0f, 6.5098f, 5.86f, 6.5098f, 6.91f)
                verticalLineTo(12.0f)
                curveTo(6.4998f, 14.2f, 7.9998f, 16.0f, 10.4998f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.75f)
                verticalLineTo(2.0f)
                curveTo(8.75f, 1.59f, 9.09f, 1.25f, 9.5f, 1.25f)
                curveTo(9.91f, 1.25f, 10.25f, 1.59f, 10.25f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.75f)
                verticalLineTo(2.0f)
                curveTo(13.75f, 1.59f, 14.09f, 1.25f, 14.5f, 1.25f)
                curveTo(14.91f, 1.25f, 15.25f, 1.59f, 15.25f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 16.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _electricity!!
    }

private var _electricity: ImageVector? = null
