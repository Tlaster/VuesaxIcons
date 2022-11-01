package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Hospital: ImageVector
    get() {
        if (_hospital != null) {
            return _hospital!!
        }
        _hospital = Builder(name = "Hospital", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22.0f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22.0f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22.0f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 2.0f, 3.0f, 3.79f, 3.0f, 6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.94f)
                curveTo(9.0f, 15.42f, 9.42f, 15.0f, 9.94f, 15.0f)
                horizontalLineTo(14.07f)
                curveTo(14.58f, 15.0f, 15.01f, 15.42f, 15.01f, 15.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.01f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 3.79f, 20.0f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(14.5f, 9.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                curveTo(12.75f, 11.41f, 12.41f, 11.75f, 12.0f, 11.75f)
                curveTo(11.59f, 11.75f, 11.25f, 11.41f, 11.25f, 11.0f)
                verticalLineTo(9.25f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 9.25f, 8.75f, 8.91f, 8.75f, 8.5f)
                curveTo(8.75f, 8.09f, 9.09f, 7.75f, 9.5f, 7.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12.0f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 7.75f, 15.25f, 8.09f, 15.25f, 8.5f)
                curveTo(15.25f, 8.91f, 14.91f, 9.25f, 14.5f, 9.25f)
                close()
            }
        }
        .build()
        return _hospital!!
    }

private var _hospital: ImageVector? = null
