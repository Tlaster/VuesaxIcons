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

public val BoldGroup.Fingercricle: ImageVector
    get() {
        if (_fingercricle != null) {
            return _fingercricle!!
        }
        _fingercricle = Builder(name = "Fingercricle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.9492f)
                curveTo(10.21f, 7.9492f, 8.75f, 9.4092f, 8.75f, 11.1992f)
                verticalLineTo(12.7992f)
                curveTo(8.75f, 14.5892f, 10.21f, 16.0492f, 12.0f, 16.0492f)
                curveTo(13.79f, 16.0492f, 15.25f, 14.5892f, 15.25f, 12.7992f)
                verticalLineTo(11.1992f)
                curveTo(15.25f, 9.4092f, 13.79f, 7.9492f, 12.0f, 7.9492f)
                close()
                moveTo(12.9f, 13.2392f)
                curveTo(12.9f, 13.7392f, 12.5f, 14.1392f, 12.0f, 14.1392f)
                curveTo(11.5f, 14.1392f, 11.1f, 13.7392f, 11.1f, 13.2392f)
                verticalLineTo(10.7692f)
                curveTo(11.1f, 10.2792f, 11.5f, 9.8692f, 12.0f, 9.8692f)
                curveTo(12.5f, 9.8692f, 12.9f, 10.2692f, 12.9f, 10.7692f)
                verticalLineTo(13.2392f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.75f, 12.8f)
                curveTo(16.75f, 15.42f, 14.62f, 17.55f, 12.0f, 17.55f)
                curveTo(9.38f, 17.55f, 7.25f, 15.42f, 7.25f, 12.8f)
                verticalLineTo(11.2f)
                curveTo(7.25f, 8.58f, 9.38f, 6.45f, 12.0f, 6.45f)
                curveTo(14.62f, 6.45f, 16.75f, 8.58f, 16.75f, 11.2f)
                verticalLineTo(12.8f)
                close()
            }
        }
        .build()
        return _fingercricle!!
    }

private var _fingercricle: ImageVector? = null
