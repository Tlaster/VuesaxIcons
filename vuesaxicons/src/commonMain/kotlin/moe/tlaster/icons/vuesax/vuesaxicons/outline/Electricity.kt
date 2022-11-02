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

public val OutlineGroup.Electricity: ImageVector
    get() {
        if (_electricity != null) {
            return _electricity!!
        }
        _electricity = Builder(name = "Electricity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 16.75f)
                horizontalLineTo(10.5f)
                curveTo(7.75f, 16.75f, 5.75f, 14.75f, 5.75f, 12.0f)
                verticalLineTo(6.92f)
                curveTo(5.75f, 5.45f, 6.95f, 4.25f, 8.42f, 4.25f)
                horizontalLineTo(15.59f)
                curveTo(17.06f, 4.25f, 18.26f, 5.45f, 18.26f, 6.92f)
                verticalLineTo(12.0f)
                curveTo(18.25f, 14.75f, 16.25f, 16.75f, 13.5f, 16.75f)
                close()
                moveTo(8.42f, 5.75f)
                curveTo(7.78f, 5.75f, 7.25f, 6.27f, 7.25f, 6.92f)
                verticalLineTo(12.0f)
                curveTo(7.25f, 13.62f, 8.25f, 15.25f, 10.5f, 15.25f)
                horizontalLineTo(13.5f)
                curveTo(15.75f, 15.25f, 16.75f, 13.62f, 16.75f, 12.0f)
                verticalLineTo(6.92f)
                curveTo(16.75f, 6.28f, 16.23f, 5.75f, 15.58f, 5.75f)
                horizontalLineTo(8.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.75f)
                curveTo(9.09f, 5.75f, 8.75f, 5.41f, 8.75f, 5.0f)
                verticalLineTo(2.0f)
                curveTo(8.75f, 1.59f, 9.09f, 1.25f, 9.5f, 1.25f)
                curveTo(9.91f, 1.25f, 10.25f, 1.59f, 10.25f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(10.25f, 5.41f, 9.91f, 5.75f, 9.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 5.75f)
                curveTo(14.09f, 5.75f, 13.75f, 5.41f, 13.75f, 5.0f)
                verticalLineTo(2.0f)
                curveTo(13.75f, 1.59f, 14.09f, 1.25f, 14.5f, 1.25f)
                curveTo(14.91f, 1.25f, 15.25f, 1.59f, 15.25f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(15.25f, 5.41f, 14.91f, 5.75f, 14.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12.0f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                close()
            }
        }
        .build()
        return _electricity!!
    }

private var _electricity: ImageVector? = null
